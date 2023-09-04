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
	@Getter @Setter private String asset_description;
	@Getter @Setter private String asset_type;
	@Getter @Setter private String type;
	@Getter @Setter private String amount;
	@Getter @Setter private String comment;
	@Getter @Setter private String party;
	@Getter @Setter private String state;
	@Getter @Setter private String industry;
	@Getter @Setter private String sector;
	@Getter @Setter private String name;
	@Getter @Setter private String ptr_link;
	@Getter @Setter private String disclosure_date;
	
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

		public String getAssetDescription() {
		return asset_description;
		}

		public void setAssetDescription(String assetDescription) {
		this.asset_description = assetDescription;
		}

		public String getAssetType() {
		return asset_type;
		}

		public void setAssetType(String assetType) {
		this.asset_type = assetType;
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

		public String getComment() {
		return comment;
		}

		public void setComment(String comment) {
		this.comment = comment;
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

		public String getIndustry() {
		return industry;
		}

		public void setIndustry(String industry) {
		this.industry = industry;
		}

		public String getSector() {
		return sector;
		}

		public void setSector(String sector) {
		this.sector = sector;
		}

		public String getname() {
		return name;
		}

		public void setname(String name) {
		this.name = name;
		}

		public String getPtrLink() {
		return ptr_link;
		}

		public void setPtrLink(String ptrLink) {
		this.ptr_link = ptrLink;
		}

		public String getDisclosureDate() {
		return disclosure_date;
		}

		public void setDisclosureDate(String disclosureDate) {
		this.disclosure_date = disclosureDate;
		}

}
