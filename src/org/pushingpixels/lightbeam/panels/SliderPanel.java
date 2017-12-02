/*
 * Copyright (c) 2008-2016 LightBeam Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of LightBeam Kirill Grouchnikov nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.lightbeam.panels;

import java.awt.*;
import java.util.Hashtable;

import javax.swing.*;

import org.pushingpixels.lightbeam.*;

/**
 * Test application panel for testing {@link JSlider} component.
 * 
 * @author Kirill Grouchnikov
 */
public class SliderPanel extends JPanel {
	private JPanel mainPanel;

	/**
	 * Creates the test panel with sliders.
	 */
	public SliderPanel() {
		this.setLayout(new BorderLayout());

		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		this.add(new JScrollPane(mainPanel), BorderLayout.CENTER);

		JPanel horPanel = new JPanel();
		BoxLayout horLayout = new BoxLayout(horPanel, BoxLayout.Y_AXIS);
		horPanel.setLayout(horLayout);

		JSlider horizontalLTR3 = new JSlider(0, 100, 50);
		horizontalLTR3.setSnapToTicks(true);
		horizontalLTR3.setMajorTickSpacing(20);
		horizontalLTR3.setMinorTickSpacing(5);
		horPanel.add(horizontalLTR3);

		JSlider horizontalLTR2 = new JSlider(0, 100, 50);
		horizontalLTR2.setSnapToTicks(true);
		horizontalLTR2.setMajorTickSpacing(20);
		horizontalLTR2.setMinorTickSpacing(5);
		horizontalLTR2.setPaintTicks(true);
		horPanel.add(horizontalLTR2);

		JSlider horizontalLTR1 = new JSlider(0, 100, 50);
		horizontalLTR1.setSnapToTicks(true);
		horizontalLTR1.setMajorTickSpacing(20);
		horizontalLTR1.setMinorTickSpacing(5);
		horizontalLTR1.setPaintLabels(true);
		horPanel.add(horizontalLTR1);

		JSlider horizontalLTR = new JSlider(0, 100, 50);
		horizontalLTR.setSnapToTicks(true);
		horizontalLTR.setMajorTickSpacing(20);
		horizontalLTR.setMinorTickSpacing(5);
		horizontalLTR.setPaintTicks(true);
		horizontalLTR.setPaintLabels(true);
		horPanel.add(horizontalLTR);

		JSlider disHorizontalLTR3 = new JSlider(0, 100, 50);
		disHorizontalLTR3.setSnapToTicks(true);
		disHorizontalLTR3.setMajorTickSpacing(20);
		disHorizontalLTR3.setMinorTickSpacing(5);
		disHorizontalLTR3.setEnabled(false);
		horPanel.add(disHorizontalLTR3);

		JSlider disHorizontalLTR2 = new JSlider(0, 100, 50);
		disHorizontalLTR2.setSnapToTicks(true);
		disHorizontalLTR2.setMajorTickSpacing(20);
		disHorizontalLTR2.setMinorTickSpacing(5);
		disHorizontalLTR2.setPaintTicks(true);
		disHorizontalLTR2.setEnabled(false);
		horPanel.add(disHorizontalLTR2);

		JSlider disHorizontalLTR1 = new JSlider(0, 100, 50);
		disHorizontalLTR1.setSnapToTicks(true);
		disHorizontalLTR1.setMajorTickSpacing(20);
		disHorizontalLTR1.setMinorTickSpacing(5);
		disHorizontalLTR1.setPaintLabels(true);
		disHorizontalLTR1.setEnabled(false);
		horPanel.add(disHorizontalLTR1);

		JSlider disHorizontalLTR = new JSlider(0, 100, 50);
		disHorizontalLTR.setSnapToTicks(true);
		disHorizontalLTR.setMajorTickSpacing(20);
		disHorizontalLTR.setMinorTickSpacing(5);
		disHorizontalLTR.setPaintTicks(true);
		disHorizontalLTR.setPaintLabels(true);
		disHorizontalLTR.setEnabled(false);
		horPanel.add(disHorizontalLTR);

		JSlider horizontalRTL = new JSlider(0, 100, 50);
		horizontalRTL.setSnapToTicks(true);
		horizontalRTL.setMajorTickSpacing(20);
		horizontalRTL.setMinorTickSpacing(5);
		horizontalRTL.setPaintTicks(true);
		horizontalRTL.setPaintLabels(true);
		horizontalRTL
				.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		horPanel.add(horizontalRTL);

		JSlider disHorizontalRTL = new JSlider(0, 100, 50);
		disHorizontalRTL.setSnapToTicks(true);
		disHorizontalRTL.setMajorTickSpacing(20);
		disHorizontalRTL.setMinorTickSpacing(5);
		disHorizontalRTL.setPaintTicks(true);
		disHorizontalRTL.setPaintLabels(true);
		disHorizontalRTL.setEnabled(false);
		disHorizontalRTL
				.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		horPanel.add(disHorizontalRTL);

		JSlider titledHorizontal = new JSlider(0, 100, 50);
		titledHorizontal.setBorder(BorderFactory.createTitledBorder("Title"));
		horPanel.add(titledHorizontal);

		JSlider coloredLabels = getSliderWithColoredLabels();
		horPanel.add(coloredLabels);

		JSlider htmlLabels = getSliderWithHTMLLabels();
		horPanel.add(htmlLabels);

		mainPanel.add(horPanel, BorderLayout.WEST);

		JPanel verPanel = new JPanel(new FlowLayout());
		mainPanel.add(verPanel, BorderLayout.CENTER);

		JSlider verticalLTR3 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		verticalLTR3.setSnapToTicks(true);
		verticalLTR3.setMajorTickSpacing(20);
		verticalLTR3.setMinorTickSpacing(5);
		verPanel.add(verticalLTR3);

		JSlider verticalLTR1 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		verticalLTR1.setSnapToTicks(true);
		verticalLTR1.setMajorTickSpacing(20);
		verticalLTR1.setMinorTickSpacing(5);
		verticalLTR1.setPaintTicks(true);
		verPanel.add(verticalLTR1);

		JSlider verticalLTR2 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		verticalLTR2.setSnapToTicks(true);
		verticalLTR2.setMajorTickSpacing(20);
		verticalLTR2.setMinorTickSpacing(5);
		verticalLTR2.setPaintLabels(true);
		verPanel.add(verticalLTR2);

		JSlider verticalLTR = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		verticalLTR.setSnapToTicks(true);
		verticalLTR.setMajorTickSpacing(20);
		verticalLTR.setMinorTickSpacing(5);
		verticalLTR.setPaintTicks(true);
		verticalLTR.setPaintLabels(true);
		verPanel.add(verticalLTR);

		JSlider disVerticalLTR = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		disVerticalLTR.setSnapToTicks(true);
		disVerticalLTR.setMajorTickSpacing(20);
		disVerticalLTR.setMinorTickSpacing(5);
		disVerticalLTR.setPaintTicks(true);
		disVerticalLTR.setPaintLabels(true);
		disVerticalLTR.setEnabled(false);
		verPanel.add(disVerticalLTR);

		JSlider verticalRTL3 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		verticalRTL3.setSnapToTicks(true);
		verticalRTL3.setMajorTickSpacing(20);
		verticalRTL3.setMinorTickSpacing(5);
		verticalRTL3
				.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		verPanel.add(verticalRTL3);

		JSlider verticalRTL1 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		verticalRTL1.setSnapToTicks(true);
		verticalRTL1.setMajorTickSpacing(20);
		verticalRTL1.setMinorTickSpacing(5);
		verticalRTL1.setPaintTicks(true);
		verticalRTL1
				.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		verPanel.add(verticalRTL1);

		JSlider verticalRTL2 = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		verticalRTL2.setSnapToTicks(true);
		verticalRTL2.setMajorTickSpacing(20);
		verticalRTL2.setMinorTickSpacing(5);
		verticalRTL2.setPaintLabels(true);
		verticalRTL2
				.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		verPanel.add(verticalRTL2);

		JSlider verticalRTL = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		verticalRTL.setSnapToTicks(true);
		verticalRTL.setMajorTickSpacing(20);
		verticalRTL.setMinorTickSpacing(5);
		verticalRTL.setPaintTicks(true);
		verticalRTL.setPaintLabels(true);
		verticalRTL
				.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		verPanel.add(verticalRTL);

		JSlider disVerticalRTL = new JSlider(JSlider.VERTICAL, 0, 100, 50);
		disVerticalRTL.setSnapToTicks(true);
		disVerticalRTL.setMajorTickSpacing(20);
		disVerticalRTL.setMinorTickSpacing(5);
		disVerticalRTL.setPaintTicks(true);
		disVerticalRTL.setPaintLabels(true);
		disVerticalRTL.setEnabled(false);
		disVerticalRTL
				.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		verPanel.add(disVerticalRTL);
	}

	private JSlider getSliderWithColoredLabels() {
		JSlider coloredLabels = new JSlider();
		coloredLabels.setMinimum(0);
		coloredLabels.setMaximum(2);
		coloredLabels.setMajorTickSpacing(1);
		coloredLabels.setPaintLabels(true);
		Hashtable labels = new Hashtable();
		JLabel l0 = new JLabel("Red");
		l0.setForeground(new Color(255, 0, 0));
		labels.put(new Integer(0), l0);
		JLabel l1 = new JLabel("Green");
		l1.setForeground(new Color(0, 255, 0));
		labels.put(new Integer(1), l1);
		JLabel l2 = new JLabel("Blue");
		l2.setForeground(new Color(0, 0, 255));
		labels.put(new Integer(2), l2);
		coloredLabels.setLabelTable(labels);
		return coloredLabels;
	}

	private JSlider getSliderWithHTMLLabels() {
		JSlider htmlLabels = new JSlider();
		htmlLabels.setMinimum(0);
		htmlLabels.setMaximum(2);
		htmlLabels.setMajorTickSpacing(1);
		htmlLabels.setPaintLabels(true);
		Hashtable labels = new Hashtable();
		JLabel l0 = new JLabel(
				"<html><body>0<br><b>0</b><br><i>0</i></body></html>");
		l0.setForeground(new Color(255, 0, 0));
		labels.put(new Integer(0), l0);
		JLabel l1 = new JLabel(
				"<html><body>1<br><b>1</b><br><i>1</i></body></html>");
		labels.put(new Integer(1), l1);
		JLabel l2 = new JLabel(
				"<html><body>2<br><b>2</b><br><i>2</i></body></html>");
		labels.put(new Integer(2), l2);
		htmlLabels.setLabelTable(labels);
		return htmlLabels;
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getChangeValuePerformanceScenario() {
		return new BasePerformanceScenario<JSlider>(SliderPanel.this,
				JSlider.class) {
			int[] perms;

			@Override
			public String getName() {
				return "Changing slider values";
			};

			@Override
			public void setup() {
				super.setup();
				this.perms = LightBeamUtils.getPermutation(100,
						getIterationCount() * this.controls.size());
			}

			@Override
			public int getIterationCount() {
				return 10;
			};

			@Override
			public void runSingleIteration(int iterationNumber) {
				int count = 0;
				for (JSlider slider : this.controls) {
					if (slider.getMaximum() == 100) {
						slider.setValue(this.perms[this.controls.size()
								* iterationNumber + count]);
					}
					count++;
				}
				paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
			};
		};
	}
}