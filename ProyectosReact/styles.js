import {StyleSheet} from 'react-native';

export default StyleSheet.create({
    container: {
        flex: 1,
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'center',
        backgroundColor: 'ghostwhite',
        paddingTop:20
      },
      box:{
        width: 300,
        height: 100,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "lightgray",
        borderWidth: 1,
        borderStyle: "dashed",
        borderColor: "darkslategray"
      },
      boxText:{
        color: "darkslategray",
        fontWeight: "bold"
      },
      row: {
        flex: 1,
        flexDirection: "row",
        justifyContent: "space-around",
        alignSelf: "stretch"
      },
    
      column: {
        flex: 1,
        flexDirection: "column",
        alignItems: "center",
        justifyContent: "space-around",
        alignSelf: "stretch"
      }
})