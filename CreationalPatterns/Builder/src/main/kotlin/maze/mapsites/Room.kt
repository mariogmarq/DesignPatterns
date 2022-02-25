package maze.mapsites

class Room(val roomNumber: Number, private val sides: MutableMap<Direction, MapSite>): MapSite() {

    override fun Enter() {
        TODO("Not yet implemented")
    }

    fun SetSide(dir: Direction, site: MapSite) = sides.put(dir, site)

    fun GetSide(dir: Direction):  MapSite? = sides[dir]
}