package geometry.utils

interface Units {
    val unitName: String
}

enum class Standard(val text: String) : Units {
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