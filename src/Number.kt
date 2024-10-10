fun main() {
  var age: Byte = 30
  var balance: Int = 400
  var sample: Float = 33.33F
  println("my Age is $age, my balance now $$balance, annually earning $$sample a day")

  //  Separator
  var price: Long = 900_000_000L
  println(price)

  //  Litereals
  var binary: Int = 0b010101010
  var hexadecimalLiteral = 0xFF
  println("$binary, hexadecimal: $hexadecimalLiteral")

  //  Conversion
  var sampleNum: Int = 100
  var byteSampleNum: Byte = sampleNum.toByte()
  println(byteSampleNum)
}
