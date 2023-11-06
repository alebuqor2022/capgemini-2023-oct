import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import styles from './styles';

export default function App7() {

  return (
    <View style={styles.container}>
      <View style={styles.box}>
        <Text style={styles.boxText}>Nro1 </Text>
      </View>
      <View style={styles.box}>
        <Text style={styles.boxText}>Nro2 </Text>
      </View>
      <View style={styles.box}>
        <Text style={styles.boxText}>Nro2 </Text>
      </View>
    </View>
  );
}