import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

export default class App extends React.Component {
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
    <WarningText style={styles.text}>Advertencia</WarningText>
  </View>)
  };
}