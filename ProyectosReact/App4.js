import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

export default class App4 extends React.Component {
  // state es un atributo de la clase
  constructor(){
    super();
    this.state = {
      tasks: ['Pablo','Patricia']
    }
      }

  render =()=>{
    return(
    <View style={styles.container}>
    {this.state.tasks.map((task,index)=> (
      <Text key={index} style={styles.text}>{task}</Text>
    ))
    }
  </View>)
  };
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'flex-start',
    paddiing: '10%',
    justifyContent: 'flex-start',
    width: '100%',
  },
  text:{
    marginTop: '5%',
    fontWeight: 'bold',
    fontSize: 40
  }
});
