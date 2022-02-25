package maze.factory

import maze.Maze
import maze.mapsites.Door
import maze.mapsites.Room
import maze.mapsites.Wall

class BombedMazeFactory: MazeFactory {
    override fun MakeMaze(): Maze {
        TODO("Not yet implemented")
    }

    override fun MakeDoor(room1: Room, room2: Room): Door {
        TODO("Return a door that can explode")
    }

    override fun MakeRoom(roomNumber: Number): Room {
        TODO("Return a room that may have a bomb inside LMAO")
    }

    override fun MakeWall(): Wall {
        TODO("Return a wall that can explode also")
    }
}