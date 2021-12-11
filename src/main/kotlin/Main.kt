import geometry.Rectangle
import geometry.utils.Metric
import geometry.utils.Imperial

fun main() {
    geometryScratchpad()
}

fun geometryScratchpad() {
    val rec1 = Rectangle(5F, 6.5F, Imperial.INCHES)
    println("Rectangle1 perimeter: ${rec1.perimeter()} ${rec1.getUnitName()}")
    println("Changing shape unit...")
    rec1.changeUnit(Imperial.MILES)
    println("Updated Rectangle1 perimeter: ${rec1.perimeter()} ${rec1.getUnitName()}")
    println("Rectangle1 special type: ${rec1.specialType()}")

    println("\n")

    val rec2 = Rectangle(5F, Metric.METERS)
    println("Rectangle2 perimeter: ${rec2.perimeter()} ${rec2.getUnitName()}")
    println("Changing shape unit...")
    rec2.changeUnit(Metric.KILOMETERS)
    println("Updated Rectangle2 perimeter: ${rec2.perimeter()} ${rec2.getUnitName()}")
    println("Rectangle2 special type: ${rec2.specialType()}")

    println("\n")

    val rec3 = Rectangle(2F, 3.236F, Imperial.YARDS)
    println("Rectangle3 perimeter: ${rec3.perimeter()} ${rec3.getUnitName()}")
    println("Changing shape unit...")
    rec3.changeUnit(Metric.CENTIMETERS)
    println("Updated Rectangle3 perimeter: ${rec3.perimeter()} ${rec3.getUnitName()}")
    println("Rectangle3 special type: ${rec3.specialType()}")
}