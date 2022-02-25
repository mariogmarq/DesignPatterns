package maze.game

import maze.Maze
import maze.factory.MazeFactory
import maze.mapsites.Direction

class MazeGame {
    fun CreateMaze(factory: MazeFactory): Maze {
        val maze = factory.MakeMaze()
        val r1 = factory.MakeRoom(1)
        val r2 = factory.MakeRoom(2)
        val door = factory.MakeDoor(r1, r2)

        r1.SetSide(Direction.North, factory.MakeWall())
        r1.SetSide(Direction.East, door)
        r1.SetSide(Direction.South, factory.MakeWall())
        r1.SetSide(Direction.West, factory.MakeWall())

        r2.SetSide(Direction.North, factory.MakeWall())
        r2.SetSide(Direction.West, door)
        r2.SetSide(Direction.South, factory.MakeWall())
        r2.SetSide(Direction.East, factory.MakeWall())

        maze.AddRoom(r1)
        maze.AddRoom(r2)

        return maze
    }
}