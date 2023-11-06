import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

const HelloText=({children,...otherProps})=>(
  <Text {...otherProps}>{children}</Text>
);

export default class App3 extends React.Component {
  // state es un atributo de la clase
  constructor(){
    super();
    this.state = {
      expanded: false
      }
  }

  expandOrCollapse(){
    this.setState({expanded: !this.state.expanded});
  }

  render =()=>{
    return(
    <View style={styles.container}>
    <HelloText onPress={()=> this.expandOrCollapse()}>Hola Capgemini!</HelloText>
    <HelloText onPress={()=> this.expandOrCollapse()} style={styles.text}> 
    Empezando un viaje sin retorno, a divertirse y no complicarse
    </HelloText>
    {this.state.expanded && 
      <HelloText style={styles.text}> 
     Expansion y contraccion de este texto, haciendo click sobre el titulo de HolaCapagemini
      </HelloText>
    }
    <StatusBar style="auto" />
  </View>)
  };
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text:{
    marginTop: '5%'
  }
});
