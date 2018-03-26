package pl.ttpsc.solid.lsp.shape;

public class Square implements Shape {

  private double a;

  public Square(double a) {
    this.a = a;
  }

  @Override
  public double calculateCircumference() {
    return 4 * a;
  }

  @Override
  public double calculateArea() {
    return a * a;
  }
}
