package threeSeventyTwo

object perfectlyBalanced {
  def balanced(str: String): Boolean = {
    if(str.isEmpty) true
    else {
      val dChars: String = str.distinct
      if(!dChars.tail.isEmpty) {
        if (str.count(_ == dChars.head) == str.count(_ == dChars.last)) true else false
      } else false
    }
  }
  def balanced_bonus(str: String): Boolean = {
    val dChars: String = str.distinct
    val counts: IndexedSeq[Int] = for(c <- dChars) yield str.count(_ == c)
    if(counts.count(_ == counts.head) == counts.length) true else false
  }
  def main(args: Array[String]): Unit = {
    println(
      balanced("xxxyyy"),
      balanced("yyyxxx"),
      balanced("xxxyyyy"),
      balanced("yyxyxxyxxyyyyxxxyxyx"),
      balanced("xyxxxxyyyxyxxyxxyy"),
      balanced(""),
      balanced("x")
    )
    println(
      balanced_bonus("xxxyyyzzz"),
      balanced_bonus("abccbaabccba"),
      balanced_bonus("xxxyyyzzzz"),
      balanced_bonus("abcdefghijklmnopqrstuvwxyz"),
      balanced_bonus("pqq"),
      balanced_bonus("fdedfdeffeddefeeeefddf"),
      balanced_bonus("www"),
      balanced_bonus("x"),
      balanced_bonus(""),
    )
  }
}