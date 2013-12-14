// default package
// Generated 2013-05-27 13:40:06 by Hibernate Tools 3.4.0.CR1
package data;
/**
 * PlayerGamesTime generated by hbm2java
 */
public class PlayerGamesTime implements java.io.Serializable {

	private int id;
	private Integer IdPlayers;
	private Integer IdGames;
	private Integer MaxRankSoFar;
	private Integer MinRankSoFar;
	private Integer CurrentRank;

	public PlayerGamesTime() {
	}

	public PlayerGamesTime(int id) {
		this.id = id;
	}

	public PlayerGamesTime(int id, Integer IdPlayers, Integer IdGames,
			Integer MaxRankSoFar, Integer MinRankSoFar, Integer CurrentRank) {
		this.id = id;
		this.IdPlayers = IdPlayers;
		this.IdGames = IdGames;
		this.MaxRankSoFar = MaxRankSoFar;
		this.MinRankSoFar = MinRankSoFar;
		this.CurrentRank = CurrentRank;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getIdPlayers() {
		return this.IdPlayers;
	}

	public void setIdPlayers(Integer IdPlayers) {
		this.IdPlayers = IdPlayers;
	}

	public Integer getIdGames() {
		return this.IdGames;
	}

	public void setIdGames(Integer IdGames) {
		this.IdGames = IdGames;
	}

	public Integer getMaxRankSoFar() {
		return this.MaxRankSoFar;
	}

	public void setMaxRankSoFar(Integer MaxRankSoFar) {
		this.MaxRankSoFar = MaxRankSoFar;
	}

	public Integer getMinRankSoFar() {
		return this.MinRankSoFar;
	}

	public void setMinRankSoFar(Integer MinRankSoFar) {
		this.MinRankSoFar = MinRankSoFar;
	}

	public Integer getCurrentRank() {
		return this.CurrentRank;
	}

	public void setCurrentRank(Integer CurrentRank) {
		this.CurrentRank = CurrentRank;
	}

}