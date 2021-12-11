package geometry

import geometry.utils.KnownShapes
import geometry.utils.RectangleTypes
import geometry.utils.Units

/**
 * A class for creating a *Rectangle* shape.
 *
 * @property x represents the width of the rectangle.
 * @property y represents the height of the rectangle.
 * @constructor Creates a new square.
 */
class Rectangle(
    private val x: Float,
    private val y: Float,
    unit: Units
) : Shape(KnownShapes.RECTANGLE, unit) {

    companion object {
        const val goldenRatio = 1.618F
    }

    constructor(x: Float, unit: Units) : this(x, x, unit)

    init {
        println("Created a '$type' shape, with a width of $x and a height of $y.")
    }

    override fun area() = y * x

    override fun perimeter() = 2 * x + 2 * y

    /**
     * Returns the special type of rectangle.
     */
    fun specialType() = when (y) {
        x -> RectangleTypes.SQUARE
        x * goldenRatio -> RectangleTypes.FIBONACCI
        else -> RectangleTypes.REGULAR
    }

}
