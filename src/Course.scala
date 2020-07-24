object Course {
    def main (args: Array [String]): Unit ={

        case class Course (courseName: String, coursePrice: Double, body: String)

        class Courses(c: Course) {
            def courseID: String = Course"- = ${type.courseType} - ${type.courseType.hashCode}"
        }

        object CourseExtensions {
            implicit def courseID (c: Course): Courses = new Courses (c)
        }

        import CourseExtensions._
        val ICE362S_Elective = Course("FT", 40000.00)
        val ICE262S_Elective = Course("FT", 35000.00)
        val ICF152S_Elective = Course("FT", 30000.00)



    }


}
