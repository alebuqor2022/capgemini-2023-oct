import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

const HelloText=({children,...otherProps})=>(
  <Text {...otherProps}>{children}</Text>
);

const App2 = () =>(
   <View style={styles.container}>
      <HelloText>Hola Capgemini!</HelloText>
      <HelloText style={styles.text}> 
      Empezando un viaje sin retorno, a divertirse y no complicarse
      </HelloText>
      <StatusBar style="auto" />
    </View>
);
export default App2;

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
