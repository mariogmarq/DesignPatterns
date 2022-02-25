package maze.factory

import maze.Maze
import maze.mapsites.Door
import maze.mapsites.Room
import maze.mapsites.Wall

interface MazeFactory {
    fun MakeMaze(): Maze
    fun MakeDoor(room1: Room, room2: Room): Door
    fun MakeRoom(roomNumber: Number): Room
    fun MakeWall(): Wall
}