/* in a class of 57 students the teacher was collecting data of her students,
* the data she required was:
* the gender of the students
* the course they are doing
* the feedback on boys playing football
* the feedback on ladies playing hockey
* the feedback on the curriculum
* using inheritance,represent the gender and course as properties
* and the feedback as methods*/

open class Student(gender: String,course: String) {
    init {
        println("gender:$gender")
        println("course:$course")
    }
    open fun feedback(){
        println("hello")
    }
}

class FemaleStudent(gender: String, course: String,val hockey:String,val curriculum: String): Student(gender,course) {

    override fun feedback() {
        println("hockeyFeedback:$hockey")
        println("curriculum feedback:$curriculum")
    }
}

class MaleStudent(gender: String, course: String,val football: String,val curriculum: String): Student(gender, course) {
    override fun feedback() {
        println("football feedback:$football")
        println("curriculum feedback:$curriculum")
    }
}

fun main() {
    val student = FemaleStudent("female", "ict", "5 ladies play hockey", "the curriculum is amazing")
    student.feedback()

    println()

    val student1 = MaleStudent("male", "medicine","10 boys play football", "curriculum need to be changed")
    student1.feedback()
}



