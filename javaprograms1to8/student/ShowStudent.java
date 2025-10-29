class ShowStudent {
    public static void main(String[] args) {
        Student student = new Student();
        
        student.setIdNumber(1234);
        student.setCreditHours(15);
        student.setPoints(54);
        student.computeGradePointAverage();
        
        System.out.println("=== Student Information ===");
        student.displayStudent();
    }
}