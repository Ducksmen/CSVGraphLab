import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class StackedAreaChartSample extends Application {

    private final NumberAxis xAxis = new NumberAxis(2007, 2014, 1);
    private final NumberAxis yAxis = new NumberAxis();
    private final StackedAreaChart<Number, Number> sac =
            new StackedAreaChart<>(xAxis, yAxis);

    @Override
    public void start(Stage stage) {
        stage.setTitle("Area Chart Sample");
        sac.setTitle("Infant Deaths over the years");
        XYChart.Series<Number, Number> seriesBlackNH =
                new XYChart.Series<>();
        seriesBlackNH.setName("Black NH");
        seriesBlackNH.getData().add(new XYChart.Data(2007, 287));
        seriesBlackNH.getData().add(new XYChart.Data(2008, 284));
        seriesBlackNH.getData().add(new XYChart.Data(2009, 259));
        seriesBlackNH.getData().add(new XYChart.Data(2010, 230));
        seriesBlackNH.getData().add(new XYChart.Data(2011, 210));
        seriesBlackNH.getData().add(new XYChart.Data(2012, 211));
        seriesBlackNH.getData().add(new XYChart.Data(2013, 201));
        seriesBlackNH.getData().add(new XYChart.Data(2014, 177));
        XYChart.Series<Number, Number> seriesPuertoRican=
                new XYChart.Series<>();
        seriesPuertoRican.setName("Puerto Rican");
        seriesPuertoRican.getData().add(new XYChart.Data(2007, 64));
        seriesPuertoRican.getData().add(new XYChart.Data(2008, 68));
        seriesPuertoRican.getData().add(new XYChart.Data(2009, 63));
        seriesPuertoRican.getData().add(new XYChart.Data(2010, 61));
        seriesPuertoRican.getData().add(new XYChart.Data(2011, 61));
        seriesPuertoRican.getData().add(new XYChart.Data(2012, 57));
        seriesPuertoRican.getData().add(new XYChart.Data(2013, 38));
        seriesPuertoRican.getData().add(new XYChart.Data(2014, 60));
        XYChart.Series<Number, Number> seriesAsianandPI=
        new XYChart.Series<>();
        seriesAsianandPI.setName("Asian and Pacific Islander");
        seriesAsianandPI.getData().add(new XYChart.Data(2007, 59));
        seriesAsianandPI.getData().add(new XYChart.Data(2008, 59));
        seriesAsianandPI.getData().add(new XYChart.Data(2009, 50));
        seriesAsianandPI.getData().add(new XYChart.Data(2010, 62));
        seriesAsianandPI.getData().add(new XYChart.Data(2011, 57));
        seriesAsianandPI.getData().add(new XYChart.Data(2012, 70));
        seriesAsianandPI.getData().add(new XYChart.Data(2013, 62));
        seriesAsianandPI.getData().add(new XYChart.Data(2014, 53));
        XYChart.Series<Number, Number> seriesOtherHispanic=
                new XYChart.Series<>();
        seriesOtherHispanic.setName("Other Hispanic");
        seriesOtherHispanic.getData().add(new XYChart.Data(2007, 130));
        seriesOtherHispanic.getData().add(new XYChart.Data(2008, 143));
        seriesOtherHispanic.getData().add(new XYChart.Data(2009, 147));
        seriesOtherHispanic.getData().add(new XYChart.Data(2010, 129));
        seriesOtherHispanic.getData().add(new XYChart.Data(2011, 124));
        seriesOtherHispanic.getData().add(new XYChart.Data(2012, 133));
        seriesOtherHispanic.getData().add(new XYChart.Data(2013, 120));
        seriesOtherHispanic.getData().add(new XYChart.Data(2014, 113));
        XYChart.Series<Number, Number> seriesWhiteNHispanic=
                new XYChart.Series<>();
        seriesWhiteNHispanic.setName("White NonHispanic");
        seriesWhiteNHispanic.getData().add(new XYChart.Data(2007, 155));
        seriesWhiteNHispanic.getData().add(new XYChart.Data(2008, 125));
        seriesWhiteNHispanic.getData().add(new XYChart.Data(2009, 131));
        seriesWhiteNHispanic.getData().add(new XYChart.Data(2010, 104));
        seriesWhiteNHispanic.getData().add(new XYChart.Data(2011, 118));
        seriesWhiteNHispanic.getData().add(new XYChart.Data(2012, 104));
        seriesWhiteNHispanic.getData().add(new XYChart.Data(2013, 117));
        seriesWhiteNHispanic.getData().add(new XYChart.Data(2014, 107));



        Scene scene = new Scene(sac, 800, 600);
        sac.getData().addAll(seriesBlackNH, seriesPuertoRican, seriesAsianandPI, seriesOtherHispanic, seriesWhiteNHispanic);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}