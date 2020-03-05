package choiceCalendar;

import javax.swing.JOptionPane;

public class Calendar {
	static int month;

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog(null, "Digite um numero de 1 a 12");
		month = Integer.parseInt(aux);
		if (month == 1) {
			JOptionPane.showMessageDialog(null, "Janeiro");
		} else {
			if (month == 2) {
				JOptionPane.showMessageDialog(null, "Fevereiro");
			} else {
				if (month == 3) {
					JOptionPane.showMessageDialog(null, "Marco");
				} else {
					if (month == 4) {
						JOptionPane.showMessageDialog(null, "Abril");
					} else {
						if (month == 5) {
							JOptionPane.showMessageDialog(null, "Maio");
						} else {
							if (month == 6) {
								JOptionPane.showMessageDialog(null, "Junho");
							} else {
								if (month == 7) {
									JOptionPane.showMessageDialog(null, "Julho");
						} else {
							if (month == 8) {
								JOptionPane.showMessageDialog(null, "Agosto");
					} else {
						if (month == 9) {											JOptionPane.showMessageDialog(null, "Setembroo");
				} else {
					if (month == 10) {
							JOptionPane.showMessageDialog(null, "Outubro");
			} else {
				if (month == 11) {
						JOptionPane.showMessageDialog(null, "Novembro");
		} else {
			if (month == 12) {
					JOptionPane.showMessageDialog(null, "Dezembro");
	}else {
		JOptionPane.showMessageDialog(null, "Numero invalido");
	}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
