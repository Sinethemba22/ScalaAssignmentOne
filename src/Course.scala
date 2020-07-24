object Course {
    def main (args: Array [String]): Unit ={

        case class Course (courseName: String, coursePrice: Double, body: String)

        val course1 = Course (implicit  "ICE362S Elective, FT,", "Course Price : R "+ 40.000.hashCode())
        val course2 = Course (implicit  courseName = "ICE262S Elective, FT", coursePrice = "Course Price :R" +35.000.hashCode())
        val course3 = Course (implicit courseName = "- ICF152S Elective, FT", coursePrice = "Course Price: R"+ 30.000.hashCode() )

        println(course1,course2,course3)

    }


}
