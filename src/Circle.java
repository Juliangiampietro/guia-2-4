public class Circle {
        private Double Ratio = 1.0;
        private String Color = "Rojo";

        public Double getRatio() {
            return Ratio;
        }

        public void setRatio(Double ratio) {
            Ratio = ratio;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String color) {
            Color = color;
        }

        public Circle(Double ratio, String color) {
            Ratio = ratio;
            Color = color;
        }

        public Double calculateArea(){
            return Ratio * Ratio * Math.PI;
        }

        public String showCircle(){
            return "El radio es: " +Ratio+" El color es: "+ Color + " El area es: " + calculateArea();
        }

    public Circle() {
    }
}



