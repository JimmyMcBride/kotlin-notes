package geometry

import geometry.utils.KnownShapes
import geometry.utils.Units

/**
 * A class for creating a *Circle* shape.
 *
 * @property radius represents the width of the rectangle.
 * @constructor Creates a new *Rectangle*.
 */
class Circle(
    private val radius: Float,
    unit: Units
) : Shape(KnownShapes.CIRCLE, unit) {

    companion object {
        const val pi = 3.141592F
    }

    init {
        println("$type created with a radius of $radius.")
    }

    override fun area() = radius * radius * pi

    override fun perimeter() = 2 * radius * pi

}