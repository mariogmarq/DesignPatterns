package maze

import maze.mapsites.Room

class Maze(val rooms: MutableList<Room>) {
    fun AddRoom(room: Room) {
        rooms.add(room)
    }

    fun RoomNo(number: Int): Room? {
        return rooms[number]
    }
}