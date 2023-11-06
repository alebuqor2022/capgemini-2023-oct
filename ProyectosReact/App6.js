import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

const AppLayout=({Header,MainContent,Footer})=>(
  <View style={styles.container}>
    <View style={styles.layoutHeader}>{Header}</View>
    <View style={styles.layoutContent}>{MainContent}</View>
    <View style={styles.layoutFooter}>{Footer}</View>
  </View>
);
const WelcomeHeader=()=>(<View><Text>Encabezado</Text></View>);
const WelcomeContent=()=>(<View><Text>Contenido</Text></View>);
const WelcomeFooter=()=>(<View><Text>Pie de Pantalla</Text></View>);
const WelcomeScreen=()=>(
  <AppLayout Header={<WelcomeHeader/>} MainContent={<WelcomeContent/>} Footer={<WelcomeFooter/>}/>
);


export default class App6 extends React.Component {
  render =()=>{
    return(<WelcomeScreen></WelcomeScreen>
  )
  };
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    marginTop: 1
  },
  layoutHeader:{
    width: '100%',
    height: 100,
    backgroundColor: 'powderblue'
  },
  layoutContent:{
    width: '100%',
    height: 100,
    backgroundColor: 'skyblue'
  },
  layoutFooter:{
    width: '100%',
    height: 100,
    backgroundColor: 'steelblue'
  },
});
