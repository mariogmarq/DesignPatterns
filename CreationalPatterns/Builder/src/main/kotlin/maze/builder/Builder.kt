package maze.builder

import maze.Maze

interface Builder {
    fun BuildMaze()
    fun BuildRoom(room: Int)
    fun BuildDoor(fromRoom: Int, toRoom: Int)
    fun GetMaze(): Maze
}

// Note: This is the implementation from the Design Patterns book, is also normal seeing this other interface(and I find it cooler)
//interface Builder {
//    fun BuildRoom(room: Int): Builder
//    fun BuildDoor(fromRoom: Int, toRoom: Int): Builder
//    fun GetMaze(): Maze
//}

// This second interface allows you method chaining and removes the buildMaze function and relegates its responsibility to the constructor
// I find it more correct since in the original interface nothing avoids you to call any other method before calling BuildMaze