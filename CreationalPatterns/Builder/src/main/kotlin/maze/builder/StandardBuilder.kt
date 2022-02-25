package maze.builder

import maze.Maze
import maze.mapsites.Direction
import maze.mapsites.Door
import maze.mapsites.Room
import maze.mapsites.Wall
import java.util.*
import kotlin.collections.ArrayList

class StandardBuilder: Builder {
    private var _maze: Maze? = null;

    override fun BuildMaze() {
        _maze = Maze(ArrayList<Room>())
    }

    override fun BuildRoom(n: Int) {
        if(_maze?.RoomNo(n) == null) {
            val room = Room(n, EnumMap(maze.mapsites.Direction::class.java))
            room.SetSide(Direction.East, Wall())
            room.SetSide(Direction.West, Wall())
            room.SetSide(Direction.North, Wall())
            room.SetSide(Direction.South, Wall())
            _maze?.AddRoom(room)
        }
    }

    override fun BuildDoor(fromRoom: Int, toRoom: Int) {
        val room1 = _maze?.RoomNo(fromRoom)
        val room2 = _maze?.RoomNo(toRoom)
        val door = Door(true, room1!!, room2!!)

        room1.SetSide(CommonWall(room1, room2), door)
        room2.SetSide(CommonWall(room2, room1), door)
    }

    override fun GetMaze(): Maze {
        return _maze!!;
    }

    private fun CommonWall(room1: Room, room2: Room): Direction {
        TODO("Find a cool wall")
    }
}