package APIConnection;


/**
* APIConnection/TVMaze_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from API.idl
* 03 April 2016 19:45:53 o'clock IST
*/

public class TVMaze_Tie extends _TVMazeImplBase
{

  // Constructors
  public TVMaze_Tie ()
  {
  }

  public TVMaze_Tie (APIConnection.TVMazeOperations impl)
  {
    super ();
    _impl = impl;
  }

  public void getShow (int id, APIConnection.Client client)
  {
    _impl.getShow(id, client);
  } // getShow

  public void getShowEpisodeList (int id, APIConnection.Client client)
  {
    _impl.getShowEpisodeList(id, client);
  } // getShowEpisodeList

  public void getShowSeasonsList (int id, APIConnection.Client client)
  {
    _impl.getShowSeasonsList(id, client);
  } // getShowSeasonsList

  public void getShowCastList (int id, APIConnection.Client client)
  {
    _impl.getShowCastList(id, client);
  } // getShowCastList

  public void getShowEpisodesByNum (int id, int season, int num, APIConnection.Client client)
  {
    _impl.getShowEpisodesByNum(id, season, num, client);
  } // getShowEpisodesByNum

  private APIConnection.TVMazeOperations _impl;

} // class TVMaze_Tie