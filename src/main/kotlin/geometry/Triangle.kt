package geometry

import geometry.utils.KnownShapes
import geometry.utils.Units
import kotlin.math.sqrt

/**
 * A class for creating a *Triangle* shape.
 *
 * @property a represents the size of an edge of the triangle.
 * @property b represents the size of an edge of the triangle.
 * @property c represents the size of an edge of the triangle.
 * @constructor Creates a new *Triangle*.
 */
class Triangle(
    private val a: Float,
    private val b: Float,
    private val c: Float,
    unit: Units
) : Shape(KnownShapes.TRIANGLE, unit) {

    init {
        println("$type created with sides of length $a, $b, and $c.")
    }

    override fun area(): Float = sqrt(
        (perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c)
    )

    override fun perimeter(): Float = a + b + c


}