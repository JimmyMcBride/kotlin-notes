package geometry.utils

/**
 * Describes the common interface between all types of units
 */
interface Units {
    val unitName: String
}

/**
 * A system of measurement in use in the United Kingdom and other Commonwealth countries consisting of units such as the inch, the mile and the pound (a unit of weight).
 */
enum class Imperial(val text: String) : Units {
    INCHES("inch(es)") {
        override val unitName = text
    },
    YARDS("yard(s)") {
        override val unitName = text
    },
    MILES("mile(s)") {
        override val unitName = text
    }
}

/**
 * A decimal system of units based on the meter as a unit length, the kilogram as a unit mass, and the second as a unit time.
 */
enum class Metric(val text: String) : Units {
    CENTIMETERS("centimeter(s)") {
        override val unitName = text
    },
    METERS("meter(s)") {
        override val unitName = text
    },
    KILOMETERS("kilometer(s)") {
        override val unitName = text
    }
}