package br.org.coletivoJava.fw.api.erp.contaPagarReceber.model.formaPagamento.pix;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class PixQRCode {

    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#0.00", new DecimalFormatSymbols(Locale.US));

    private String receiverFullName;
    private String receiverCity;
    private boolean withValue;
    private double value;
    private String transactionIdentifier;
    private String pixKey;
    private String descricao;

    public String getAsText() {
        StringBuilder stringBuilder = new StringBuilder();

        // Payload Format Indicator:
        stringBuilder.append("000201");

        // Merchant Account Information - Cartões:
        stringBuilder.append("");

        // Merchant Account Information - PIX:
        final String merchantAccountInformation = "0014BR.GOV.BCB.PIX" + "01"
                + (pixKey.length() < 10 ? "0" + pixKey.length() : pixKey.length())
                + this.pixKey;
        if (descricao != null && !descricao.isEmpty()) {
            stringBuilder.append("02")
                    .append(descricao.length())
                    .append(descricao);
        }

        stringBuilder.append("26")
                .append(merchantAccountInformation.length())
                .append(merchantAccountInformation);

        // Merchant Category Code:
        stringBuilder.append("52040000");

        // Transaction Currency:
        stringBuilder.append("5303986");

        // Transaction Amount:
        if (withValue) {
            String formattedValue = DECIMAL_FORMAT.format(value);

            stringBuilder.append("54")
                    .append(formattedValue.length() < 10 ? "0" + formattedValue.length() : formattedValue.length())
                    .append(formattedValue);
        }

        // Country Code:
        stringBuilder.append("5802BR");

        // Merchant Name:
        stringBuilder.append("59")
                .append(receiverFullName.length() < 10 ? "0" + receiverFullName.length() : receiverFullName.length())
                .append(receiverFullName);

        // Merchant City:
        stringBuilder.append("60")
                .append(receiverCity.length() < 10 ? "0" + receiverCity.length() : receiverCity.length())
                .append(receiverCity);

        // Postal code:
        stringBuilder.append("");

        // Additional Data Field:
        final String transactionIdentifierFinalString
                = "05" + (transactionIdentifier.length() < 10 ? "0" + transactionIdentifier.length() : transactionIdentifier.length()) + transactionIdentifier;

        stringBuilder.append("62")
                .append(
                        transactionIdentifierFinalString.length() < 10 ? "0" + transactionIdentifierFinalString.length()
                        : transactionIdentifierFinalString.length())
                .append(transactionIdentifierFinalString);

        // Unreserved Templates:
        stringBuilder.append("");

        // CRC16-CCITT (0xffff):
        stringBuilder.append("6304");
        stringBuilder.append(Crc16CCITTChecksum.crc(stringBuilder.toString()).toUpperCase());

        return stringBuilder.toString();
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public boolean isWithValue() {
        return withValue;
    }

    public void setWithValue(boolean withValue) {
        this.withValue = withValue;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
