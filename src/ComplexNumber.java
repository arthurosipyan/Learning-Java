public class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double r, double i){
            this.real = r;
            this.imaginary = i;
        }

        public double getReal(){
            return this.real;
        }

        public double getImaginary(){
            return this.imaginary;
        }

        public void add(double r, double i){
            this.real += r;
            this.imaginary += i;
        }

        public void add(ComplexNumber complexNumber){
            this.real += complexNumber.getReal();
            this.imaginary += complexNumber.getImaginary();
        }

        public void subtract(double r, double i){
            this.real -= r;
            this.imaginary -= i;
        }

        public void subtract(ComplexNumber complexNumber) {
            this.real -= complexNumber.getReal();
            this.imaginary -= complexNumber.getImaginary();
        }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
