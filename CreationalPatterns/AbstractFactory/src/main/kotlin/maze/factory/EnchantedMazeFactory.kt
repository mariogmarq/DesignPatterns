package maze.factory

import maze.Maze
import maze.mapsites.Door
import maze.mapsites.Room
import maze.mapsites.Wall

class EnchantedMazeFactory: MazeFactory {
    override fun MakeMaze(): Maze {
        TODO("Not yet implemented")
    }

    override fun MakeDoor(room1: Room, room2: Room): Door {
        TODO("Returns an enchanted door")
    }

    override fun MakeRoom(roomNumber: Number): Room {
        TODO("Return and enchanted room")
    }

    override fun MakeWall(): Wall {
        TODO("return an enchanted wall")
    }
}