package GameLogic;

public class Player {

	private Faction faction;
	private int victoryPoints;
	private Map<String, > positionOnCultBoard;
	private BonusCard bonusCard;
	private ArrayList<FavorTile> favorTiles;
	private ArrayList<TownTile> townTiles;
	private int remainingBridges;
	private String name;
	private int id;
	private boolean passed;
	private int[] noOfStructures;
	private ArrayList<Terrain> controlledTerrains;
	private ActionHandler actionHandler;

	public void chooseBonusCard() {
		// TODO - implement Player.chooseBonusCard
		throw new UnsupportedOperationException();
	}

	public void getVictoryPoints() {
		// TODO - implement Player.getVictoryPoints
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param point
	 */
	public void setVictoryPoints(int point) {
		this.victoryPoints = point;
	}

	public int getRemainingBridge() {
		// TODO - implement Player.getRemainingBridge
		throw new UnsupportedOperationException();
	}

	public void setRemainingBridge() {
		// TODO - implement Player.setRemainingBridge
		throw new UnsupportedOperationException();
	}

	public Faction getFaction() {
		return this.faction;
	}

	/**
	 * 
	 * @param faction
	 */
	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	public void setNoOfStructures() {
		// TODO - implement Player.setNoOfStructures
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param positionOnCultBoard
	 */
	public void setPositionOnCultBoard(Map<String, > positionOnCultBoard) {
		this.positionOnCultBoard = positionOnCultBoard;
	}

	public Map<String, > getPositionOnCultBoard() {
		return this.positionOnCultBoard;
	}

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public Player(int id, String name) {
		// TODO - implement Player.Player
		throw new UnsupportedOperationException();
	}

	public ArrayList<Terrain> getControlledTerrains() {
		return this.controlledTerrains;
	}

	/**
	 * 
	 * @param controlledTerrains
	 */
	public void setControlledTerrains(ArrayList<Terrain> controlledTerrains) {
		this.controlledTerrains = controlledTerrains;
	}

}