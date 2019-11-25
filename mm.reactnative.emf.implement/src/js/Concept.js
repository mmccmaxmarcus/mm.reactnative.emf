import React, Component from 'react' 
import {Text, FlatList, StyleSheet, View} from 'react-native'
export default class Concept extends Component{ 
 
render() { 

return( 
	<View style = {styles.container}>
 		<FlatList data={this.props.navigation.getParam('concepts')} keyExtractor={item => `${item.id}`} 
renderItem={this.renderItem}/>
 	</View>
)}
const styles = create ({
	container: {
 	}, 	
})