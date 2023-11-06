import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

export default function App1() {

  return (
    <View style={styles.container}>
      <Text>Hola Mundo!</Text>
      <Text stryle={styles.text}> Empezando un viaje sin retorno</Text>
      <StatusBar style="auto" />
    </View>
  );
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
