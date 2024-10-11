fun main() {
  val names = arrayOf("Joko", "Budi", "Seno")
  println(names[0])

  names[0] = "Rudi"
  println(names[0])

  val results = arrayOf(1, 2, 4)
  println(results[1])

  val members = arrayOfNulls<String>(5)
  println(members[4])
}