package de.jupetersen.shop.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import de.jupetersen.shop.entity.Warenkorb;

public class WarenkorbTableModel implements TableModel {

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
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
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
		return wert;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

	}

	@Override
	public void addTableModelListener(TableModelListener l) {

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {

	}

}
