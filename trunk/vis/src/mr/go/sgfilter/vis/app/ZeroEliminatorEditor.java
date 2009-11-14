/*
 * Copyright [2009] [Marcin Rzeźnicki]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package mr.go.sgfilter.vis.app;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import org.jdesktop.application.Application;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

public class ZeroEliminatorEditor extends javax.swing.JPanel {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JCheckBox					alignToLeftCheckBox;

	private final ZeroEliminatorBean	bean;

	private BindingGroup				bindingGroup;

	/** Creates new form ZeroEliminatorEditor */
	public ZeroEliminatorEditor() {
		this(null);
	}

	// End of variables declaration//GEN-END:variables

	public ZeroEliminatorEditor(
			ZeroEliminatorBean bean) {
		this.bean = bean;
		initComponents();
	}

	public ZeroEliminatorBean getBean() {
		return bean;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		bindingGroup = new BindingGroup();

		alignToLeftCheckBox = new JCheckBox();
		ResourceMap resourceMap = Application
				.getInstance(mr.go.sgfilter.vis.app.Application.class)
				.getContext()
				.getResourceMap(ZeroEliminatorEditor.class);
		setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(
				0,
				0,
				0), 1, true), resourceMap
				.getString("ZeroEliminatorEditor.border.title"))); // NOI18N
		setName("ZeroEliminatorEditor"); // NOI18N
		setPreferredSize(new Dimension(540, 100));

		alignToLeftCheckBox.setText(resourceMap
				.getString("alignToLeftCheckBox.text")); // NOI18N
		alignToLeftCheckBox.setName("alignToLeftCheckBox"); // NOI18N

		Binding binding = Bindings.createAutoBinding(
				UpdateStrategy.READ_WRITE,
				this,
				ELProperty.create("${bean.aligningToLeft}"),
				alignToLeftCheckBox,
				BeanProperty.create("selected"));
		bindingGroup.addBinding(binding);

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						layout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(alignToLeftCheckBox)
								.addContainerGap(425, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						layout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(alignToLeftCheckBox)
								.addContainerGap(46, Short.MAX_VALUE)));

		bindingGroup.bind();
	}// </editor-fold>//GEN-END:initComponents

	private static final long	serialVersionUID	= -441192274866863553L;
}
