import React, Component from 'react' 
import {Text, FlatList, StyleSheet, View} from 'react-native'
export default class Elements extends Component{ 
 
render() { 

return( 
	<View >
 		<FlatList data={this.props.navigation.getParam('elements')} keyExtractor={item => `${item.id}`} 
renderItem={this._renderItem}/>
 	</View>
)}
