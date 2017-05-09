import java.util.ArrayList;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.SortedSet;
import javax.swing.DefaultComboBoxModel;

public class FlightScheduler extends javax.swing.JFrame {

    private ArrayList<String> flightNames = new ArrayList<String>();
    private ArrayList<String> flightDates = new ArrayList<String>();
    private ArrayList<String> getCustomerName = new ArrayList<String>();
    private ArrayList<String> comboFlightStrings = new ArrayList<String>();
    private ArrayList<String> comboDateStrings = new ArrayList<String>();
    private SortedSet<String> comboCustomerStrings;

    public FlightScheduler() {
        initComponents();
        flightNames = Flight.flightComboPopulation();
        flightDates = Day.dateComboPopulation();
        comboCustomerStrings = Customer.customerList();
        cancelCustomerNameCombo.setModel(new DefaultComboBoxModel(comboCustomerStrings.toArray()));
        customerStatusNameCombo.setModel(new DefaultComboBoxModel(comboCustomerStrings.toArray()));
        flightBookingCombo.setModel(new DefaultComboBoxModel(flightNames.toArray()));
        dateBookingCombo.setModel(new DefaultComboBoxModel(flightDates.toArray()));
        flightFlightCombo.setModel(new DefaultComboBoxModel(flightNames.toArray()));
        dateFlightCombo.setModel(new DefaultComboBoxModel(flightDates.toArray()));
        dateWaitlistCombo.setModel(new DefaultComboBoxModel(flightDates.toArray()));
        dropFlightCombo.setModel(new DefaultComboBoxModel(flightNames.toArray()));
        cancelCustomerDateCombo.setModel(new DefaultComboBoxModel(flightDates.toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        waitlistStatusTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        flightBookingCombo = new javax.swing.JComboBox<>();
        dateBookingCombo = new javax.swing.JComboBox<>();
        bookingConfirmButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookingStatusTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateFlightCombo = new javax.swing.JComboBox<>();
        flightFlightCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersBookedTextArea = new javax.swing.JTextArea();
        flightStatusConfirm = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dateWaitlistCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customersWaitlistedTextArea = new javax.swing.JTextArea();
        waitlistStatusConfirm = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        customerStatusConfirm = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        customerStatusTextArea = new javax.swing.JTextArea();
        customerStatusNameCombo = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        addDateConfirm = new javax.swing.JButton();
        addDateSpinner = new javax.swing.JSpinner();
        jScrollPane6 = new javax.swing.JScrollPane();
        addDateTextArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        seatsAddFlightTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        flightAddFlightTextField = new javax.swing.JTextField();
        addFlightConfirm = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        addFlightTextArea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        dropFlightConfirm = new javax.swing.JButton();
        dropFlightCombo = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        dropFlightTextArea = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cancelCustomerDateCombo = new javax.swing.JComboBox<>();
        cancelCustomerConfirm = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        cancelCustomerTextArea = new javax.swing.JTextArea();
        cancelCustomerNameCombo = new javax.swing.JComboBox<>();

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel7.setText("FLIGHT:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setText("             FLIGHT SCHEDULER");

        waitlistStatusTab.setBackground(new java.awt.Color(255, 255, 255));
        waitlistStatusTab.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel2.setText("DATE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        nameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        nameLabel.setText("CUSTOMER NAME:");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 67, -1, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel4.setText("FLIGHT:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 138, -1, -1));

        nameTextField.setBackground(new java.awt.Color(240, 240, 240));
        nameTextField.setColumns(20);
        nameTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 67, -1, -1));

        flightBookingCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        flightBookingCombo.setModel(new javax.swing.DefaultComboBoxModel(comboFlightStrings.toArray()));
        flightBookingCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightBookingComboActionPerformed(evt);
            }
        });
        jPanel1.add(flightBookingCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 135, -1, -1));

        dateBookingCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        dateBookingCombo.setModel(new javax.swing.DefaultComboBoxModel(comboDateStrings.toArray())
        );
        dateBookingCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateBookingComboActionPerformed(evt);
            }
        });
        jPanel1.add(dateBookingCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 208, -1, -1));

        bookingConfirmButton.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        bookingConfirmButton.setText("CONFIRM");
        bookingConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingConfirmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bookingConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 622, 47));

        bookingStatusTextArea.setColumns(20);
        bookingStatusTextArea.setRows(5);
        jScrollPane3.setViewportView(bookingStatusTextArea);
        bookingStatusTextArea.setEditable(false);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 394, 740, -1));

        waitlistStatusTab.addTab("BOOKINGS", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel5.setText("FLIGHT:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel6.setText("DATE:");

        dateFlightCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        dateFlightCombo.setModel(new javax.swing.DefaultComboBoxModel(comboDateStrings.toArray()));
        dateFlightCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFlightComboActionPerformed(evt);
            }
        });

        flightFlightCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        flightFlightCombo.setModel(new javax.swing.DefaultComboBoxModel(comboFlightStrings.toArray()));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel10.setText("CUSTOMERS BOOKED:");

        customersBookedTextArea.setColumns(20);
        customersBookedTextArea.setRows(5);
        jScrollPane1.setViewportView(customersBookedTextArea);
        customersBookedTextArea.setEditable(false);

        flightStatusConfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        flightStatusConfirm.setText("CONFIRM");
        flightStatusConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightStatusConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateFlightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(flightFlightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(flightStatusConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(flightFlightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(flightStatusConfirm)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateFlightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        waitlistStatusTab.addTab("FLIGHT STATUS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateWaitlistCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        dateWaitlistCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(dateWaitlistCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 34, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel8.setText("DATE:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 34, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel9.setText("CUSTOMERS WAITLISTED:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 128, -1, -1));

        customersWaitlistedTextArea.setColumns(20);
        customersWaitlistedTextArea.setRows(5);
        jScrollPane2.setViewportView(customersWaitlistedTextArea);
        customersWaitlistedTextArea.setEditable(false);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 128, 470, 182));

        waitlistStatusConfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        waitlistStatusConfirm.setText("CONFIRM");
        waitlistStatusConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitlistStatusConfirmActionPerformed(evt);
            }
        });
        jPanel3.add(waitlistStatusConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 167, -1));

        waitlistStatusTab.addTab("WAITLIST STATUS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel14.setText("CUSTOMER STATUS:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        customerStatusConfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        customerStatusConfirm.setText("CONFIRM");
        customerStatusConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerStatusConfirmActionPerformed(evt);
            }
        });
        jPanel4.add(customerStatusConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel15.setText("CUSTOMER NAME:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        customerStatusTextArea.setColumns(20);
        customerStatusTextArea.setRows(5);
        jScrollPane9.setViewportView(customerStatusTextArea);
        customerStatusTextArea.setEditable(false);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 470, 182));

        customerStatusNameCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jPanel4.add(customerStatusNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 310, -1));

        waitlistStatusTab.addTab("CUSTOMER STATUS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel13.setText("DATE:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        addDateConfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        addDateConfirm.setText("CONFIRM");
        addDateConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDateConfirmActionPerformed(evt);
            }
        });
        jPanel5.add(addDateConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        addDateSpinner.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        addDateSpinner.setModel(new javax.swing.SpinnerDateModel());
        jPanel5.add(addDateSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        addDateTextArea.setColumns(20);
        addDateTextArea.setRows(5);
        jScrollPane6.setViewportView(addDateTextArea);
        addDateTextArea.setEditable(false);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 700, -1));

        waitlistStatusTab.addTab("ADD DATE", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seatsAddFlightTextField.setBackground(new java.awt.Color(240, 240, 240));
        seatsAddFlightTextField.setColumns(3);
        seatsAddFlightTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel6.add(seatsAddFlightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel11.setText("SEATS:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel12.setText("FLIGHT:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        flightAddFlightTextField.setBackground(new java.awt.Color(240, 240, 240));
        flightAddFlightTextField.setColumns(5);
        flightAddFlightTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel6.add(flightAddFlightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        addFlightConfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        addFlightConfirm.setText("CONFIRM");
        addFlightConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightConfirmActionPerformed(evt);
            }
        });
        jPanel6.add(addFlightConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        addFlightTextArea.setColumns(20);
        addFlightTextArea.setRows(5);
        jScrollPane5.setViewportView(addFlightTextArea);
        addFlightTextArea.setEditable(false);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 700, -1));

        waitlistStatusTab.addTab("ADD FLIGHT", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel16.setText("FLIGHT:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        dropFlightConfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        dropFlightConfirm.setText("CONFIRM");
        dropFlightConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropFlightConfirmActionPerformed(evt);
            }
        });
        jPanel7.add(dropFlightConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        dropFlightCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        dropFlightCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(dropFlightCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        dropFlightTextArea.setColumns(20);
        dropFlightTextArea.setRows(5);
        jScrollPane7.setViewportView(dropFlightTextArea);
        dropFlightTextArea.setEditable(false);

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 700, -1));

        waitlistStatusTab.addTab("DROP FLIGHT", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel17.setText("CUSTOMER NAME:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel18.setText("DATE:");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        cancelCustomerDateCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        cancelCustomerDateCombo.setModel(new javax.swing.DefaultComboBoxModel(comboDateStrings.toArray()));
        cancelCustomerDateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCustomerDateComboActionPerformed(evt);
            }
        });
        jPanel8.add(cancelCustomerDateCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        cancelCustomerConfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        cancelCustomerConfirm.setText("CONFIRM");
        cancelCustomerConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCustomerConfirmActionPerformed(evt);
            }
        });
        jPanel8.add(cancelCustomerConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        cancelCustomerTextArea.setColumns(20);
        cancelCustomerTextArea.setRows(5);
        jScrollPane8.setViewportView(cancelCustomerTextArea);
        cancelCustomerTextArea.setEditable(false);

        jPanel8.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 700, -1));

        cancelCustomerNameCombo.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jPanel8.add(cancelCustomerNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 310, -1));

        waitlistStatusTab.addTab("CANCEL CUSTOMER", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(waitlistStatusTab, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waitlistStatusTab, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void waitlistStatusConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitlistStatusConfirmActionPerformed
        ArrayList<String> waitlistOutput = new ArrayList<String>();

        waitlistOutput = Waitlist.checkWaitlist(Date.valueOf(dateWaitlistCombo.getSelectedItem().toString()));
        customersWaitlistedTextArea.append("The customers waiting for seats are:\n");
        for (String customer : waitlistOutput) {
            customersWaitlistedTextArea.append(customer + "\n");
        }
        customersWaitlistedTextArea.append("\n");
    }//GEN-LAST:event_waitlistStatusConfirmActionPerformed

    private void bookingConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingConfirmButtonActionPerformed
        String str = Booking.bookNewCustomer(nameTextField.getText(), flightBookingCombo.getSelectedItem().toString(),
                Date.valueOf(dateBookingCombo.getSelectedItem().toString()));
        bookingStatusTextArea.append(str);
        bookingStatusTextArea.append("\n");
    }//GEN-LAST:event_bookingConfirmButtonActionPerformed

    private void dateBookingComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateBookingComboActionPerformed

    }//GEN-LAST:event_dateBookingComboActionPerformed

    private void flightBookingComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightBookingComboActionPerformed

    }//GEN-LAST:event_flightBookingComboActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed

    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void flightStatusConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightStatusConfirmActionPerformed
        ArrayList<String> flightStatusOutput = new ArrayList<String>();

        flightStatusOutput = Booking.checkBooked(flightFlightCombo.getSelectedItem().toString(),
                Date.valueOf(dateFlightCombo.getSelectedItem().toString()));
        customersBookedTextArea.append("The passengers on the flight " + flightFlightCombo.getSelectedItem().toString()
                + " on the date " + Date.valueOf(dateFlightCombo.getSelectedItem().toString()) + " are:\n");
        for (String customer : flightStatusOutput) {
            customersBookedTextArea.append(customer + "\n");
        }
        customersBookedTextArea.append("\n");
    }//GEN-LAST:event_flightStatusConfirmActionPerformed

    private void dateFlightComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFlightComboActionPerformed
            
    }//GEN-LAST:event_dateFlightComboActionPerformed

    private void addFlightConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightConfirmActionPerformed
        try {
            int numSeats = Integer.parseInt(seatsAddFlightTextField.getText());
            if (numSeats <= 0) {
                addFlightTextArea.append("You need to enter a value greater than 0.\n");
            }
            else {
                String str = Flight.addFlight(flightAddFlightTextField.getText(), numSeats);
                addFlightTextArea.append(str);
            }
        }
        catch (NumberFormatException e) {
            addFlightTextArea.append("The value you entered for the number of seats wasn't accepted. "
                    + "Please enter a positive non-zero integer.\n");
        }

        comboFlightStrings = Flight.flightComboPopulation();
        flightFlightCombo.setModel(new javax.swing.DefaultComboBoxModel(comboFlightStrings.toArray()));
        flightBookingCombo.setModel(new javax.swing.DefaultComboBoxModel(comboFlightStrings.toArray()));
        dropFlightCombo.setModel(new javax.swing.DefaultComboBoxModel(comboFlightStrings.toArray()));
    }//GEN-LAST:event_addFlightConfirmActionPerformed

    private void addDateConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDateConfirmActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        String spinnerValue = formater.format(addDateSpinner.getValue());
        Date day = Date.valueOf(spinnerValue);
        Day.addDate(day);
        
        addDateTextArea.append("The date has been added to the system.\n");
        
        comboDateStrings = Day.dateComboPopulation();
        dateBookingCombo.setModel(new DefaultComboBoxModel(comboDateStrings.toArray()));
        dateFlightCombo.setModel(new DefaultComboBoxModel(comboDateStrings.toArray()));
        dateWaitlistCombo.setModel(new DefaultComboBoxModel(comboDateStrings.toArray()));
        cancelCustomerDateCombo.setModel(new DefaultComboBoxModel(comboDateStrings.toArray()));
    }//GEN-LAST:event_addDateConfirmActionPerformed

    private void customerStatusConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerStatusConfirmActionPerformed
        Customer.statusCheck(customerStatusNameCombo.getSelectedItem().toString(), null, true);
    }//GEN-LAST:event_customerStatusConfirmActionPerformed

    private void dropFlightConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropFlightConfirmActionPerformed
        Flight.dropFlight(dropFlightCombo.getSelectedItem().toString());
        dropFlightTextArea.append("The flight was dropped from the system.\n");

        comboFlightStrings = Flight.flightComboPopulation();
        flightFlightCombo.setModel(new javax.swing.DefaultComboBoxModel(comboFlightStrings.toArray()));
        flightBookingCombo.setModel(new javax.swing.DefaultComboBoxModel(comboFlightStrings.toArray()));
        dropFlightCombo.setModel(new javax.swing.DefaultComboBoxModel(comboFlightStrings.toArray()));
    }//GEN-LAST:event_dropFlightConfirmActionPerformed

    private void cancelCustomerDateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCustomerDateComboActionPerformed

    }//GEN-LAST:event_cancelCustomerDateComboActionPerformed

    private void cancelCustomerConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCustomerConfirmActionPerformed
        Customer.cancelCustomer(cancelCustomerNameCombo.getSelectedItem().toString(), 
                Date.valueOf(cancelCustomerDateCombo.getSelectedItem().toString()),false);
        comboCustomerStrings = Customer.customerList();
        customerStatusNameCombo.setModel(new javax.swing.DefaultComboBoxModel(comboCustomerStrings.toArray()));
        cancelCustomerNameCombo.setModel(new javax.swing.DefaultComboBoxModel(comboCustomerStrings.toArray()));
    }//GEN-LAST:event_cancelCustomerConfirmActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlightScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightScheduler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDateConfirm;
    private javax.swing.JSpinner addDateSpinner;
    public static javax.swing.JTextArea addDateTextArea;
    private javax.swing.JButton addFlightConfirm;
    public static javax.swing.JTextArea addFlightTextArea;
    private javax.swing.JButton bookingConfirmButton;
    private javax.swing.JTextArea bookingStatusTextArea;
    private javax.swing.JButton cancelCustomerConfirm;
    public static javax.swing.JComboBox<String> cancelCustomerDateCombo;
    private javax.swing.JComboBox<String> cancelCustomerNameCombo;
    public static javax.swing.JTextArea cancelCustomerTextArea;
    private javax.swing.JButton customerStatusConfirm;
    private javax.swing.JComboBox<String> customerStatusNameCombo;
    public static javax.swing.JTextArea customerStatusTextArea;
    public static javax.swing.JTextArea customersBookedTextArea;
    public static javax.swing.JTextArea customersWaitlistedTextArea;
    public static javax.swing.JComboBox<String> dateBookingCombo;
    public static javax.swing.JComboBox<String> dateFlightCombo;
    public static javax.swing.JComboBox<String> dateWaitlistCombo;
    private javax.swing.JComboBox<String> dropFlightCombo;
    private javax.swing.JButton dropFlightConfirm;
    public static javax.swing.JTextArea dropFlightTextArea;
    private javax.swing.JTextField flightAddFlightTextField;
    private javax.swing.JComboBox<String> flightBookingCombo;
    private javax.swing.JComboBox<String> flightFlightCombo;
    private javax.swing.JButton flightStatusConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField seatsAddFlightTextField;
    private javax.swing.JButton waitlistStatusConfirm;
    private javax.swing.JTabbedPane waitlistStatusTab;
    // End of variables declaration//GEN-END:variables
}