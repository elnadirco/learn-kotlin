const val APP = "Learn Kotlin"
const val APP_VERSION = "1.8.0"

fun main() {
  // Immutable
  val firstname = "Daniel"
  val age = 38

  println("$firstname, my age is $age")

  //  Mutable & Nullable Var
  var name: String? = null
  name = "Junaidi"
  println(name?.length)

  //  Constant Call
  println("this app named $APP at $APP_VERSION version")
}