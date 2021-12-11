package geometry

import geometry.utils.KnownShapes
import geometry.utils.Units

/**
 * An abstract class for creating new shapes.
 *
 * @property type specifies what kind of this shape this is from our known list of shapes.
 * @constructor Initializes a new shape.
 */
abstract class Shape(
    protected val type: KnownShapes,
    private var unit: Units
) {

    init {
        println("Creating new shape of the type: '$type'")
    }

    /**
     * Calculates the *inside* area covered by the shape.
     */
    abstract fun area(): Float

    /**
     * Calculates the length of the *outside* edge(s) of the shape.
     */
    abstract fun perimeter(): Float

    /**
     * Gets the unit type of the shape.
     */
    fun getUnitName() = unit.unitName

    /**
     * Changes the unit of measurement for the shape.
     *
     * @property newUnit changes the current name property to the value of this parameter.
     */
    fun changeUnit(newUnit: Units) {
        unit = newUnit
    }
}
