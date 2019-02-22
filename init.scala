package begin

object arr1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(28); 
  
  val answer = 8 * 5 + 2;System.out.println("""answer  : Int = """ + $show(answer ));$skip(21); val res$0 = 
  ("hello" + answer);System.out.println("""res0: String = """ + $show(res$0));$skip(37); 
  
  var hello = "hello".toUpperCase;System.out.println("""hello  : String = """ + $show(hello ));$skip(25); val res$1 = 
  
  scala.math.sqrt(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(40); 

	def count(p: (Char) => Boolean) : Int;System.out.println("""count: (p: Char => Boolean)Int""");$skip(28); val res$2 = 
	"hXdsdWe".count(_.isUpper);System.out.println("""res2: Int = """ + $show(res$2))}
}
