package component;

import java.awt.Color;
import raven.chart.geo.utils.GeoData;

public class HomeForm extends javax.swing.JPanel {

    public HomeForm() {
        initComponents();
        geoChart.load(GeoData.Resolution.LOW);
        geoChart.getGeoChart().zoom(1.8);
        geoChart.putData("Vietnam", 8691, new Color(167, 85, 201));
        geoChart.putData("India", 7770, new Color(85, 159, 201));
        geoChart.putData("Philippines", 7017, new Color(89, 152, 97));
        geoChart.putData("Indonesia", 2869, new Color(200, 149, 61));
        geoChart.putData("Morocco", 2409, new Color(73, 104, 210));
        geoChart.putData("Mexico", 2023, new Color(180, 73, 168));
        geoChart.putData("Brazil", 1988, new Color(82, 209, 211));
        geoChart.setGeoChartDataView(geoChartDataView);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geoChart = new raven.chart.geo.GeoChart();
        geoChartDataView = new raven.chart.geo.GeoChartDataView();

        setBackground(new java.awt.Color(245, 245, 245));

        geoChart.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geoChart, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addComponent(geoChartDataView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geoChart, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geoChartDataView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.chart.geo.GeoChart geoChart;
    private raven.chart.geo.GeoChartDataView geoChartDataView;
    // End of variables declaration//GEN-END:variables
}
