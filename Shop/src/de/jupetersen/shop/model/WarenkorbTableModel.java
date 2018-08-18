package de.jupetersen.shop.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

import de.jupetersen.shop.entity.Warenkorb;

public class WarenkorbTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Warenkorb warenkorb;

	public WarenkorbTableModel(Warenkorb warenkorb) {
		this.warenkorb = warenkorb;

	}

	@Override
	public int getRowCount() {
		return warenkorb.getEintraege().size();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public String getColumnName(int columnIndex) {
		String name;
		if (0 == columnIndex) {
			name = "Produkt";
		} else if (1 == columnIndex) {
			name = "Preis";
		} else if (2 == columnIndex) {
			name = "Anzahl";
		} else {
			name = "Gesamtsumme";
		}
		return name;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return 2 == columnIndex ? Integer.class : String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return 2 == columnIndex;
	}

	@Override
	// getValueAt gibt die einzelnen Zellenwerte (getProdukt......) wieder.
	public Object getValueAt(int rowIndex, int columnIndex) {
		String wert;
		switch (columnIndex) {
		case 0:
			wert = warenkorb.getEintraege().get(rowIndex).getProdukt().getProdukt();
			break;
		case 1:
			wert = Double.toString(warenkorb.getEintraege().get(rowIndex).getProdukt().getPreis());
			break;
		case 2:
			wert = Integer.toString(warenkorb.getEintraege().get(rowIndex).getMenge());
			break;
		default:
			wert = Double.toString(warenkorb.getEintraege().get(rowIndex).getGesammtpreis());
		}
		return  wert;
	}

	@Override
	// setValueAt wird Aufgerufen wenn ein Zellenwert durch den Anwender über die
	// Oberfläche geändert wurde.
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		System.out.println(String.format("%s\t%d\t%d", aValue.getClass().getName(), rowIndex, columnIndex));
		warenkorb.getEintraege().get(rowIndex).setMenge(Integer.valueOf(aValue.toString()));
		fireTableDataChanged();
	}

	@Override
	public void addTableModelListener(TableModelListener l) {

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {

	}

}
