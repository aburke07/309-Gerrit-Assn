public static void main(String[] args) {
    Student[] a = new SortingAlgorithms.Student[5];
    a[0] = new Student(75, 2016);
    a[1] = new Student(52, 2019);
    a[2] = new Student(57, 2016);
    a[3] = new Student(220, 2014);
    a[4] = new Student(16, 2018);

    Arrays.sort(a);

    System.out.println(Arrays.toString(a));
}
