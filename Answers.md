#Answers for Lab 10

##Malka Bracha Bachrach


--The starting point gives the resulting graph a different order, but it does not make it easier or harder to traverse.

--On the real map of the world, there is water. In order for the whole map to be colored with only 4 colors, the water would end up being the same color as some countries that do not touch any water. This would not properly show the oceans and lakes.

--Also, in cases where the country has disconnected parts of it, 4 colors would not be enough because the parts touch different lands and can't be the same color as any of them.

--RandomWalkIterator goes to any random vertex that it wants from the ones connected by an edge to the vertex that it is on. It can go to the vertexes as many times as it wants.

--ClosestFirstIterator goes to the vertex that is attached to it. If there are more than one, then it chooses the one who's edge was initiated first among the choices, and it puts the others into a queue.