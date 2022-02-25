package maze.game

import maze.Maze
import maze.builder.Builder
import maze.mapsites.Direction

class MazeGame {
    fun CreateMaze(builder: Builder): Maze {
        builder.BuildMaze()
        builder.BuildRoom(1)
        builder.BuildRoom(2)
        builder.BuildDoor(1, 2)

        return builder.GetMaze()
    }
}