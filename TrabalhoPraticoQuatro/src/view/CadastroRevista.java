package view;
import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodolfo
 */
public class CadastroRevista extends javax.swing.JFrame {

	EstoqueGeral estoqueGeral;
	public CadastroRevista(EstoqueGeral estoqueGeral) 
	{
		initComponents();
		this.estoqueGeral = estoqueGeral;
	}
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		txtTitulo = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		txtEdicao = new javax.swing.JSpinner();
		txtDatapublicacao = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		txtEditora = new javax.swing.JTextField();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		txtQuantidade = new javax.swing.JSpinner();
		jLabel17 = new javax.swing.JLabel();
		txtPreco = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		txtTipoRevista = new javax.swing.JTextField();
		txtAutorLivro = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtNome = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Cadastrar uma revista");
		setResizable(false);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do livro"));

		jLabel9.setText("Autor");

		jLabel10.setText("Data de publicacao");

		jLabel4.setText("Titulo");

		txtEdicao.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

		jLabel1.setText("Editora");

		jLabel15.setText("Edicao");

		jLabel16.setText("Quantidade");

		jLabel17.setText("Preco");

		jLabel3.setText("Nome");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel4)
										.addGap(18, 18, 18)
										.addComponent(txtTitulo))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel9)
										.addGap(18, 18, 18)
										.addComponent(txtAutorLivro))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addComponent(txtEditora))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel15)
										.addGap(18, 18, 18)
										.addComponent(txtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel16)
										.addGap(18, 18, 18)
										.addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel17)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel10)
												.addComponent(jLabel2))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtDatapublicacao)
												.addComponent(txtTipoRevista)))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel3)
										.addGap(18, 18, 18)
										.addComponent(txtNome)))
						.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3)
								.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(12, 12, 12)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel9)
								.addComponent(txtAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(txtTipoRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(15, 15, 15)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(txtDatapublicacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel15)
								.addComponent(txtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel16)
								.addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel17)
								.addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(277, 277, 277))
				);

		jButton1.setText("Cadastrar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, Short.MAX_VALUE)
						.addGap(18, 18, 18)
						.addComponent(jButton1)
						.addContainerGap())
				);

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		this.estoqueGeral.cadastrarRevista(
				new Revista(
						txtNome.getText(),
						txtTipoRevista.getText(),
						txtTitulo.getText(),
						txtDatapublicacao.getText(),
						Float.valueOf(txtPreco.getText()),
						txtEditora.getText(),
						(int) txtEdicao.getValue(),
						(int) txtQuantidade.getValue()));

		JOptionPane.showMessageDialog(null, "Revista cadastrada com sucesso");
		this.setVisible(false);
	}


	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CadastroRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CadastroRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CadastroRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CadastroRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CadastroRevista(new EstoqueGeral(new ArrayList<Livro>(),new  ArrayList<Revista>(),new ArrayList<Cliente>())).setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txtAutorLivro;
	private javax.swing.JTextField txtDatapublicacao;
	private javax.swing.JSpinner txtEdicao;
	private javax.swing.JTextField txtEditora;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtPreco;
	private javax.swing.JSpinner txtQuantidade;
	private javax.swing.JTextField txtTipoRevista;
	private javax.swing.JTextField txtTitulo;

}
