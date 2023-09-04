package tradetracker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trade {
	@Getter @Setter private String transaction_date;
	@Getter @Setter private String owner;
	@Getter @Setter private String ticker;
	@Getter @Setter private String type;
	@Getter @Setter private String amount;
	@Getter @Setter private String party;
	@Getter @Setter private String state;
	@Getter @Setter private String name;
	@Getter @Setter private String disclosure_date;
	@Getter @Setter private String price;
	
	public Trade() {
		
	}
	
	public String getTransactionDate() {
		return transaction_date;
		}

		public void setTransactionDate(String transactionDate) {
		this.transaction_date = transactionDate;
		}

		public String getOwner() {
		return owner;
		}

		public void setOwner(String owner) {
		this.owner = owner;
		}

		public String getTicker() {
		return ticker;
		}

		public void setTicker(String ticker) {
		this.ticker = ticker;
		}

		public String getType() {
		return type;
		}

		public void setType(String type) {
		this.type = type;
		}

		public String getAmount() {
		return amount;
		}

		public void setAmount(String amount) {
		this.amount = amount;
		}

		public String getPrice() {
		return price;
		}

		public void setPrice(String price) {
		this.price = price;
		}

		public String getParty() {
		return party;
		}

		public void setParty(String party) {
		this.party = party;
		}

		public String getState() {
		return state;
		}

		public void setState(String state) {
		this.state = state;
		}

		public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
		}

		public String getDisclosureDate() {
		return disclosure_date;
		}

		public void setDisclosureDate(String disclosureDate) {
		this.disclosure_date = disclosureDate;
		}

}
