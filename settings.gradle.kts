rootProject.name = "refactoring-golf"

(1..7).forEach { hole ->
    include("hole$hole")
}